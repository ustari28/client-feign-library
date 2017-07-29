package com.alan.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Alan Dávila<br>
 *         27 Jul. 2017 22:34
 */
@Service
@FeignClient(name = "client-app", qualifier = "clientRestFeign", url = "${client.server.url}/client")
public interface IClientRest {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<ClienteDTO> get(@PathVariable("id") String id);

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces =
            MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<ClienteDTO> create();
}
