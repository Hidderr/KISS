package fr.neamar.summon.dataprovider;

import java.util.ArrayList;

import fr.neamar.summon.holder.Holder;
import fr.neamar.summon.holder.SearchHolder;

public class SearchProvider extends Provider {

	public ArrayList<Holder> getResults(String query) {
		ArrayList<Holder> holders = new ArrayList<Holder>();

		SearchHolder holder = new SearchHolder();
		holder.query = query;
		holder.relevance = 10;
		holders.add(holder);
		return holders;
	}
}