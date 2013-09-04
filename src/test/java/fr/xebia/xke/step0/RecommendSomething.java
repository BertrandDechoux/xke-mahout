package fr.xebia.xke.step0;

import java.util.List;

import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.junit.Test;

import fr.xebia.xke.Common;

public class RecommendSomething {
	
	@Test
	@SuppressWarnings({"unused", "null"})
	public void testRecommendation() throws Exception {
		String filename = Common.DATASET_FILENAME;
		
		// First concept : a data model holds all the data.
		// Instantiate here, a file based data model.
		DataModel dataModel = null;
		
		// Second concept : a similarity allows to compare things, like user.
		// Instantiate here, the default pearson correlation similarity (ie unweighted).
		UserSimilarity userSimilarity = null;
		
		// Third concept : a neighborhood is a selection (ie subset) of things, like user.
		// Instantiate here, a neighborhood selecting at best the 2 nearest users.
		UserNeighborhood neighborhood = null;
		
		// Fourth concept : the recommender uses everything above do to the real recommendation.
		// Instantiate here, a generic user based recommender.
		UserBasedRecommender recommender = null;
		
		// Do a actual recommendation and print the results.
		List<RecommendedItem> recommendedItems = recommender.recommend(1, 100);
		
		for (RecommendedItem recommendedItem : recommendedItems) {
			System.out.println(recommendedItem);
		}
		
		// Observe by adding one recommendation to the datafile
		// the recommendation will not be displayed anymore
		// ie if a highly relevant item was not rated, it would be recommended
	}

}
