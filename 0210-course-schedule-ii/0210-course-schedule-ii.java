public class Solution {
	HashMap<Integer, List<Integer>> map;
	int[] visited;
    int seq;
    int[] order;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    	order = new int[numCourses];
    	seq = numCourses - 1;
        visited = new int[numCourses];
        map = new HashMap<Integer, List<Integer>>();
        //Put all start node into map.
        for (int i = 0; i < prerequisites.length; i++) {
        	if (!map.containsKey(prerequisites[i][1])) {
        		map.put(prerequisites[i][1], new ArrayList<Integer>());
        	}
        	map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        //dfs on each start node in the pair
        for (int i = 0; i < numCourses; i++) {
        	if (!dfs(i)) {
        		return new int[]{};
        	}
        }
        return order;
    }

    public boolean dfs (int node) {
    	if (visited[node] == 1) {//has been through this path, true.
    		return true;
    	}
    	if (visited[node] == -1) {//visiting a visited node from a deper level node, cycle
    		return false;
    	}
    	//mark it -1 then after dfs mark it 1. Marking and backtracking skills
    	visited[node] = -1;

    	//Visit each child and make sure there is no cycle.
    	if (map.containsKey(node)) {
    		for (int nextNode : map.get(node)) {
    			if (!dfs(nextNode)) {
    				return false;
    			}
    		}
    	}
    	visited[node] = 1;
        order[seq--] = node;
    	return true;
    }

}
