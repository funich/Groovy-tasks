@Library("test-runner-lab") _
import com.mnt_lab.*

def testRunner = new tests()
node {
	stage('Checkout') {
		git branch: env.JOB_NAME,  url: 'https://github.com/MNT-Lab/Groovy-tasks.git'
	}
	testRunner.exec()
}
