package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Jehmiah P.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "kosnax";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-11");
        team.addMember("Avaneesh K.");
        team.addMember("Ethan C.");
        team.addMember("Sagnik B.");
        team.addMember("Ethan K.");
        team.addMember("Tara R.");
        team.addMember("Jehmiah P.");
        return team;
    }
}
