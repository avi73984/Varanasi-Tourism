package android.com.varanasiproject;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class secondActivityTest {

    public ActivityTestRule<secondActivity>obj=new ActivityTestRule<>(secondActivity.class);
    private secondActivity sactivity=null;
    @Before
    public void setUp() throws Exception {
        sactivity=obj.getActivity();
    }
    public void testLaunch()
    {
        View v=sactivity.findViewById(R.id.nav_home);
        assertNotNull(v);
    }

    @After
    public void tearDown() throws Exception {
        sactivity=null;
    }

    @Test
    public void onCreate() {
    }

    @Test
    public void onBackPressed() {
    }

    @Test
    public void onCreateOptionsMenu() {
    }

    @Test
    public void onOptionsItemSelected() {
    }

    @Test
    public void onNavigationItemSelected() {
    }
}