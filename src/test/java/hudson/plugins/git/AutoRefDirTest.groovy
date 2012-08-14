package hudson.plugins.git

import org.jvnet.hudson.test.HudsonTestCase
import hudson.model.TaskListener
import hudson.util.StreamTaskListener

/**
 * Verifies the use of the auto reference directory.
 */
class AutoRefDirTest extends HudsonTestCase {
    protected TaskListener listener

    def repo

    void setUp() throws Exception {
        super.setUp()

        StreamTaskListener.fromStderr();

        repo = new TestGitRepo("repo", this, listener)
    }
    
    public void testAutoRefConfig() throws Exception {

    }
}
