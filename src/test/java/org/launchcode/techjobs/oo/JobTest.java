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
    public void estJobsForEquality(){
        Job sample3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job sample4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(sample3.equals(sample4));
    };



}
