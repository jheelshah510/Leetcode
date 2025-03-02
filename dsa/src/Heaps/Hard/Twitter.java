package Heaps.Hard;

import java.util.*;

public class Twitter {

    int count;

    HashMap<Integer, List<List<Integer>>> tweetMap; // Maps userId -> List of (count, tweetId) // store userId with count nd tweetId

    HashMap<Integer, HashSet<Integer>> followMap; // who follows who

    public Twitter() {
        this.count = 0;
        this.tweetMap = new HashMap<>();
        this.followMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        tweetMap.putIfAbsent(userId, new ArrayList<>());
        tweetMap.get(userId).add(List.of(count, tweetId));
        count++;
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparing(l -> l.get(0)));

        HashSet<Integer> followers = followMap.getOrDefault(userId, new HashSet<>());
        followers.add(userId);
        for (int user : followers) {
            List<List<Integer>> tweets = tweetMap.getOrDefault(user, new ArrayList<>());
            for (List<Integer> tweet : tweets) {
                pq.offer(tweet);
                if (pq.size() > 10) pq.poll();
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().get(1));
        }

        Collections.reverse(result);

        return result;
    }

    public void follow(int followerId, int followeeId) {
        HashSet<Integer> ht = followMap.getOrDefault(followerId, new HashSet<>());
        ht.add(followeeId);
        followMap.put(followerId, ht);
    }

    public void unfollow(int followerId, int followeeId) {
        HashSet<Integer> ht = followMap.getOrDefault(followerId, new HashSet<>());
        if (ht.size() != 0 && ht.contains(followeeId)) {
            ht.remove(followeeId);
        }
        followMap.put(followerId, ht);
    }
}
