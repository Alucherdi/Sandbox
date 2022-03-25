package Sandbox.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/user")
public class User {
    @POST
    @Produces("text/plain")
    public String login(
        @FormParam("user") String user,
        @FormParam("pass") String pass
    ) {
        String[] users = new String[]{
            "Alu", "Kirito", "Hearbox"
        };

        String[] passs = new String[]{
            "alu123", "soyputo", "gpi"
        };

        int userIndex = 0;
        String response;

        for (int i = 0; i < users.length; i++) {
            if (user.compareTo(users[i]) == 0) {
                userIndex = i;
                break;
            }
        }

        if (pass.compareTo(passs[userIndex]) == 0) {
            response = "Bienvenido";
        } else {
            response = "Credenciales incorrectas";
        }

        return response;
    }
}
