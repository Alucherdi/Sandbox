package Sandbox.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.JSONObject;

@Path("/user")
public class User {
    @POST
    @Produces("text/plain")
    public String login(
        @FormParam("user") String user,
        @FormParam("pass") String pass
    ) {
        String[] users = new String[]{
            "alu", "kirito", "hearbox"
        };

        String[] passs = new String[]{
            "alu123", "soyputo", "gpi"
        };

        String[] nicknames = new String[]{
            "Alucherdi", "Glitch", "Jett"
        };

        int userIndex = 0;
        JSONObject respuesta = new JSONObject();

        for (int i = 0; i < users.length; i++) {
            if (user.compareTo(users[i]) == 0) {
                userIndex = i;
                break;
            }
        }

        if (pass.compareTo(passs[userIndex]) == 0) {
            respuesta.put("codigo", 0);
            respuesta.put("nickname", nicknames[userIndex]);
        } else {
            respuesta.put("codigo", 1);
        }

        return respuesta.toString();
    }
}
