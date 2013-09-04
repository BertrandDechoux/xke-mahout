package fr.xebia.xke.step2;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.common.Weighting;
import org.apache.mahout.cf.taste.impl.similarity.CityBlockSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.SpearmanCorrelationSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.UncenteredCosineSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.common.RandomUtils;
import org.junit.Assert;
import org.junit.Test;

public class OptimizeARecommender {
	
	@Test
	@SuppressWarnings("unused")
	public void testSizeOfNeighborhood() throws Exception {
		// keeping the same implementation as before
		// how does the size of the neighborhood influence the performance (root mean square error) of the recommender?
		int[] sizes = {5, 10, 20, 40, 100, 200, 300, 400, 600, 800, 1200};
		
		for (final int n : sizes) {
			// make random behave always in the same manner
			RandomUtils.useTestSeed();
			
			Assert.fail();
		}
	}
	
	@Test
	@SuppressWarnings("unused")
	public void testThresholdOfNeighborhood() throws Exception {
		// keeping the same implementation as before except that we use a threshold based neighborhood
		// how does the threshold of the neighborhood influence the performance (root mean square error) of the recommender?
		
		double[] thresholds = {0.9, 0.7, 0.5, 0.1, 0.05, 0.001, 0.005, 0.001, 0.0001, 0.00001};
		
		for (final double threshold : thresholds) {
			// make random behave always in the same manner
			RandomUtils.useTestSeed();
			
			Assert.fail();
		}
	}
	
	@SuppressWarnings("unused")
	private UserSimilarity getSimilarityFor(DataModel dataModel, int i) throws TasteException {
		switch (i) {
			case 0 :
				return new PearsonCorrelationSimilarity(dataModel);
			case 1 :
				return new PearsonCorrelationSimilarity(dataModel, Weighting.WEIGHTED);
			case 2:
				return new SpearmanCorrelationSimilarity(dataModel);
			case 3:
				return new UncenteredCosineSimilarity(dataModel);
			case 4:
				return new UncenteredCosineSimilarity(dataModel, Weighting.WEIGHTED);
			case 5:
				return new CityBlockSimilarity(dataModel); // ie Manhattan
			case 6:
				return new TanimotoCoefficientSimilarity(dataModel);
			case 7:
				return new LogLikelihoodSimilarity(dataModel);
			default :
				return null;
		}
	}
	
	@Test
	@SuppressWarnings("unused")
	public void testSimilarities() throws Exception {
		// keeping a neighborhood with the top 300 users
		// how does the similarity influence the performance (root mean square error) of the recommender?
		
		for (int i = 0; i < 8; i++) {
			final int n = i;
			// make random behave always in the same manner
			RandomUtils.useTestSeed();
			
			Assert.fail();
		}
	}
	
	@Test
	public void testRandomness() throws Exception {
		// RandomUtils.useTestSeed(); allows you to create stable unit test
		// but in reality one should make a decision on several different test results in order to know the variance
		
		// check how with the default pearson similarity and the top 300 users as neighborhood
		// the results might change between different runs with the same configuration
		
		for (int i = 0; i < 10; i++) {
			Assert.fail();
		}
	}

}
