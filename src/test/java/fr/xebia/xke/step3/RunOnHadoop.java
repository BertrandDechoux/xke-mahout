package fr.xebia.xke.step3;

import org.junit.Ignore;
import org.junit.Test;

/**
<pre>
In this part, we will install hadoop on a single machine.

1) Download lastest version (2.1.1)
-> http://hadoop.apache.org/releases.html#Download
-> http://mir2.ovh.net/ftp.apache.org/dist/hadoop/common/hadoop-1.2.1/hadoop-1.2.1.tar.gz

2) Untar

3) Change configuration in conf directory (see test/resources/hadoop)
-> core-site.xml : define fs.default.name
-> hdfs-site.xml : define dfs.replication
-> mapred-site.xml : define mapred.job.tracker
-> hadoop-env.sh : change JAVA_HOME (best is a 1.6 jre but 1.7 should work fine)

4) Check passless shh connection to itself
-> you should be able to remotly connect to yourself without password
ssh localhost

If not,

4a) Activate remote login
-> on mac, go to 'System Preferences' > 'Sharing' > 'Remote Login'

4b) Configure shh
ssh-keygen -t dsa -P '' -f ~/.ssh/id_dsa
cat ~/.ssh/id_dsa.pub >> ~/.ssh/authorized_keys

5) Format namenode (create a new blank filesystem for Hadoop)
bin/hadoop namenode -format

6) Launch all daemons
bin/start-all.sh

7) Check everything is running
jps
-> you should at least see 1 NameNode, 1 DataNode, 1 JobTracker, 1 TaskTracker
-> if not, run for help

-> you should also be able to connect to the web interfaces
-> NameNode - http://localhost:50070/
-> JobTracker - http://localhost:50030/

8) Copy the data into the Hadoop filesystem
bin/hadoop fs -put src/test/resources/ml-100k/ua.base /data/ua.base
bin/hadoop fs -ls /data

9) Run the jobs
bin/hadoop jar xke-mahout-1.0-SNAPSHOT-jar-with-dependencies.jar org.apache.mahout.cf.taste.hadoop.item.RecommenderJob \
	--input /data \
	--output /output \
	--similarityClassname org.apache.mahout.math.hadoop.similarity.cooccurrence.measures.PearsonCorrelationSimilarity
	
10) Check the results
bin/hadoop fs -cat /output/part-r-00000

</pre>
 */
public class RunOnHadoop {

	@Test
	@Ignore
	public void runCommandLine() throws Exception {
	}

}
