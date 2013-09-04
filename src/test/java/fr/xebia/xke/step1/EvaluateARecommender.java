package fr.xebia.xke.step1;

import static org.fest.assertions.Assertions.assertThat;

import org.apache.mahout.cf.taste.eval.IRStatistics;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.eval.RecommenderIRStatsEvaluator;
import org.apache.mahout.cf.taste.impl.eval.GenericRecommenderIRStatsEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;
import org.junit.Test;

public class EvaluateARecommender {
	
	@Test
	@SuppressWarnings("unused")
	public void testErrorEvalutation() throws Exception {
		// make random behave always in the same manner
		RandomUtils.useTestSeed();
		
		// Fifth concept : the evaluator allows to test the 'performance' of the recommender results.
		// Instantiate here, a root mean square based evaluator.
		RecommenderEvaluator evaluator = null;
		
		// Sixth concept : the recommender builder allows the evaluator to inject its own data model.
		// Use the previous exercise to complete it.
		RecommenderBuilder recommenderBuilder = null;
		
		// evaluate the recommender using 30% of the whole dataset as the test set
		// @see method evaluator.evaluate
		double score = 0;
		System.out.println(score);
		
		assertThat(score).isGreaterThan(1.17).isLessThan(1.18);
	}
	
	@Test
	@SuppressWarnings("null")
	public void testRankingEvaluation() throws Exception {
		// same thing with ranking evaluator
		
		RecommenderIRStatsEvaluator evaluator = null;
		RecommenderBuilder recommenderBuilder = null;
		DataModel dataModel = null;
		
		// evaluate the ranking performance of the recommender
		IRStatistics stats = evaluator.evaluate(recommenderBuilder, null, dataModel, null, 5, GenericRecommenderIRStatsEvaluator.CHOOSE_THRESHOLD, 1.0);
		System.out.println(stats.getPrecision());
		System.out.println(stats.getRecall());
		
		assertThat(stats.getPrecision()).isGreaterThan(0.026).isLessThan(0.027);
		assertThat(stats.getRecall()).isGreaterThan(0.032).isLessThan(0.032);
	}

}
