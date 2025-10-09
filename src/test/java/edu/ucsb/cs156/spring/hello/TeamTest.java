package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("f25-11", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Avaneesh K."), "Team should contain Avaneesh K.");
        assertTrue(t.getMembers().contains("Ethan C."), "Team should contain Ethan C.");
        assertTrue(t.getMembers().contains("Sagnik B."), "Team should contain Sagnik B.");
        assertTrue(t.getMembers().contains("Ethan K."), "Team should contain Ethan K.");
        assertTrue(t.getMembers().contains("Tara R."), "Team should contain Tara R.");
        assertTrue(t.getMembers().contains("Jehmiah P."), "Team should contain Jehmiah P.");
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
