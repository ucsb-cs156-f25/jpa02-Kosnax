package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_same_object() {
        assertTrue(team.equals(team), "Team should equal itself");
    }

    @Test
    public void equals_returns_false_for_different_class() {
        assertFalse(team.equals("a string"), "Team should not equal a different class");
    }

    @Test
    void equals_returns_true_same_name_same_members(){
        Team team1 = new Team("Team A");
        team1.addMember("A1");
        team1.addMember("A2");

        Team team2 = new Team("Team A");
        team2.addMember("A1");
        team2.addMember("A2");

        assertTrue(team1.equals(team2));
    }

     @Test
    void equals_returns_true_same_name_different_members() {
        Team team1 = new Team("Team A");
        team1.addMember("A1");
        team1.addMember("A2");

        Team team2 = new Team("Team A");
        team2.addMember("A3");
        team2.addMember("A4");

        assertFalse(team1.equals(team2));
    }

    @Test
    void equals_returns_true_different_name_same_members() {
        Team team1 = new Team("Team A");
        team1.addMember("A1");
        team1.addMember("A2");

        Team team2 = new Team("Team B");
        team2.addMember("A1");
        team2.addMember("A2");

        assertFalse(team1.equals(team2));
    }

    @Test
    void equals_returns_true_different_name_different_members() {
        Team team1 = new Team("Team A");
        team1.addMember("A1");
        team1.addMember("A2");

        Team team2 = new Team("Team B");
        team2.addMember("B1");
        team2.addMember("B2");

        assertFalse(team1.equals(team2));
    }

    @Test
    void hashcode_returns_true_same_name_same_members(){
        Team team1 = new Team("Team A");
        team1.addMember("A1");
        team1.addMember("A2");

        Team team2 = new Team("Team A");
        team2.addMember("A1");
        team2.addMember("A2");

        assertEquals(team1.hashCode(), team2.hashCode());
    }

    @Test
    void hashcode_returns_equal_with_hardcoded_result(){
        Team team1 = new Team("Team A");
        team1.addMember("A1");t
        team1.addMember("A2");
        int result = team1.hashCode();
        int expectedResult = -1793781794;
        assertEquals(expectedResult, result);
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
