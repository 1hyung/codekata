class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val genreToSongs = mutableMapOf<String, MutableList<Pair<Int, Int>>>()
        val genreToTotalPlays = mutableMapOf<String, Int>()

        // 장르별로 노래와 재생 횟수를 저장
        for (i in genres.indices) {
            val genre = genres[i]
            val play = plays[i]

            genreToSongs.computeIfAbsent(genre) { mutableListOf() }.add(Pair(i, play))
            genreToTotalPlays[genre] = genreToTotalPlays.getOrDefault(genre, 0) + play
        }

        // 장르를 총 재생 횟수로 내림차순 정렬
        val sortedGenres = genreToTotalPlays.entries.sortedByDescending { it.value }.map { it.key }

        val result = mutableListOf<Int>()

        for (genre in sortedGenres) {
            // 각 장르에서 재생 횟수로 내림차순, 고유 번호로 오름차순 정렬
            val songs = genreToSongs[genre]!!.sortedWith(compareByDescending<Pair<Int, Int>> { it.second }.thenBy { it.first })
            // 상위 두 곡만 추가
            result.addAll(songs.take(2).map { it.first })
        }

        return result.toIntArray()
    }
}