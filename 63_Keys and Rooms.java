class Solution {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		int n = rooms.size();
		boolean[] visited = new boolean[n];
		dfs(rooms,0,visited);
		for(int i=0;i<visited.length;i++) if(!visited[i]) return false;
		return true;
	}

	void dfs(List<List<Integer>> list,int index,boolean[] visited){
		if(visited[index]) return;
		visited[index] = true;
		if(list.get(index).size()==0) return;
		for(Integer i : list.get(index)){
			dfs(list,i,visited);
		}
	}
}