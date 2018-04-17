package com.example.controller;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.utilities.GenericRequestResponse;

@RestController(value="/")
public class InverMessageController {
	
	@RequestMapping
    public GenericRequestResponse get() {
        return new GenericRequestResponse("Hello World!");
    }
	@RequestMapping(value="/inverse",method= RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody  GenericRequestResponse reverseMessage(@RequestBody GenericRequestResponse request){
		String message = request.getMessage();
		int length = message.length();
		String reversed = IntStream.range(0,length)
					.map(i -> length - i - 1 )
					.mapToObj(i -> Character.toString(message.charAt(i)))
					.collect(Collectors.joining());
		return new GenericRequestResponse(reversed);

	}
}
