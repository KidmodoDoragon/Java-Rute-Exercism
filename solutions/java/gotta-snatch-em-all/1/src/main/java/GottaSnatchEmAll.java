import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cardsSet = new HashSet<>();
        for(String card: cards){
            cardsSet.add(card);
        }
        return cardsSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        int cardsCount = collection.size();
        collection.add(card);
        return !(cardsCount == collection.size()); 
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.isEmpty() || theirCollection.isEmpty()){
            return false;
        }else if(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection)){
            return false;
        }else return true;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commons = new HashSet<>();
        commons.addAll(collections.get(0));
        
        for(Set<String> collection: collections){
            commons.retainAll(collection);
        }
        return commons;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
    
        for(Set<String> collection: collections){
            all.addAll(collection);
        }
        return all;
    }
}
