package ca.baskwo.controller;

import ca.baskwo.entity.Merchandise;
import ca.baskwo.entity.Order;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Path("order")
public class OrderController {
    private List<Order> orders;

    @PostConstruct
    public void init() {
        orders = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            List<Merchandise> merchandises = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                merchandises.add(new Merchandise(2 * i + j + 1, "Order " + i, "Merchandise " + j));
            }

            orders.add(new Order(i, LocalDateTime.now(), merchandises));
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response message() {
        return Response.ok(orders).build();
    }

}
