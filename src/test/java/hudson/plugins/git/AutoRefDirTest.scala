package hudson.plugins.git

import org.jvnet.hudson.test.HudsonTestCase
import hudson.model.TaskListener
import hudson.util.StreamTaskListener

class AutoRefDirTest extends HudsonTestCase {
  def listener : TaskListener = StreamTaskListener.fromStderr()
  val repo : TestGitRepo = new TestGitRepo("repo", this, listener)

  def testAutoRefConfig() : Unit = {

  }
}