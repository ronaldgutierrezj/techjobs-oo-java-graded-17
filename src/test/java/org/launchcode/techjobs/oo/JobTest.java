package org.launchcode.techjobs.oo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job sample1 = new Job();
        Job sample2 = new Job();

        assertNotEquals(sample1.getId(),sample2.getId());

    };
    @Test
    public void testJobConstructorSetsAllFields(){
        Job sample3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", sample3.getName());
        assertTrue(sample3.getName() instanceof String);

        assertEquals("ACME", sample3.getEmployer().getValue());
        assertTrue(sample3.getEmployer() instanceof Employer);

        assertEquals("Desert", sample3.getLocation().getValue());
        assertTrue(sample3.getLocation() instanceof Location);

        assertEquals("Quality control", sample3.getPositionType().getValue());
        assertTrue(sample3.getPositionType() instanceof PositionType);

        assertEquals("Persistence", sample3.getCoreCompetency().getValue());
        assertTrue(sample3.getCoreCompetency() instanceof CoreCompetency);

    };

    @Test
    public void testJobsForEquality(){
        Job sample3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job sample4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(sample3.equals(sample4));
    };

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job sample3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();

        assertEquals(newLine,String.valueOf(sample3.toString().charAt(0)));
        assertEquals(newLine,String.valueOf(sample3.toString().charAt(sample3.toString().length() - 1)));
    };

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job sample3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        String textToPrint = newLine + "ID: " + sample3.getId() + newLine + "Name: " + sample3.getName() + newLine + "Employer: " + sample3.getEmployer().getValue() + newLine + "Location: " + sample3.getLocation().getValue() + newLine + "Position Type: " + sample3.getPositionType().getValue() + newLine + "Core Competency: " + sample3.getCoreCompetency().getValue() + newLine;

        assertEquals(textToPrint,sample3.toString());

    };

    @Test
    public void testToStringHandlesEmptyField(){
        Job sample3 = new Job("Product tester",new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        String textToPrint = newLine + "ID: " + sample3.getId() + newLine + "Name: " + sample3.getName() + newLine + "Employer: " + "Data not available" + newLine + "Location: " + sample3.getLocation().getValue() + newLine + "Position Type: " + sample3.getPositionType().getValue() + newLine + "Core Competency: " + sample3.getCoreCompetency().getValue() + newLine;

        assertEquals(textToPrint,sample3.toString());

    };

    @Test
    public void testToStringHandlesAllEmptyFields(){
        Job sample3 = new Job();
        String newLine = System.lineSeparator();
        String textToPrint = newLine + "OOPS! This job does not seem to exist." + newLine;

        assertEquals(textToPrint,sample3.toString());

    };

}
