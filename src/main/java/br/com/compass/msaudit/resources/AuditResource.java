package br.com.compass.msaudit.resources;

import br.com.compass.msaudit.domain.model.Order;
import br.com.compass.msaudit.repository.AuditRepository;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/audit")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuditResource {

    private AuditRepository auditRepository;

    @Inject
    public AuditResource(AuditRepository auditRepository){
        this.auditRepository = auditRepository;
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") ObjectId id){
        Order order = auditRepository.findById(id);
        if (order == null){
            return Response.status(404).entity("Order id: " + id + " not found.").build();
        }
        return Response.ok(order).build();
    }
}
