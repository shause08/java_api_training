package fr.lernejo.navy_battle;

public class Launcher {
    public static void main(String[] args) throws Exception{
        if (args.length == 1)
        {
            System.out.println("Starting server on port " + args[0] + "...");
            int port = Integer.parseInt(args[0]);
            server.start(port);
            System.out.println("Server Started succesfully");
        }
        else
            System.out.println("Please provide a port");
    }
}
