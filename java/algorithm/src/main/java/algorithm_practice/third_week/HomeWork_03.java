package algorithm_practice.third_week;

//Q. 멜론에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 한다.
//
//노래는 인덱스로 구분하며, 노래를 수록하는 기준은 다음과 같다.
//
//1. 속한 노래가 많이 재생된 장르를 먼저 수록한다. (단, 각 장르에 속한 노래의재생 수 총합은 모두 다르다.)
//
//2. 장르 내에서 많이 재생된 노래를 먼저 수록한다.
//
//3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록한다.
//
//
//노래의 장르를 나타내는 문자열 배열 genres와
//노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,
//
//베스트 앨범에 들어갈 노래의 인덱스를 순서대로 반환하시오.

import java.util.*;

public class HomeWork_03 {
    public static void main(String[] args) {
        System.out.println("정답 = [4, 1, 3, 0] / 현재 풀이 값 = "
                + Arrays.toString(getMelonBestAlbum(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})));
        System.out.println(("정답 = [0, 6, 5, 2, 4, 1] / 현재 풀이 값 = "
                + Arrays.toString(getMelonBestAlbum(new String[]{"hiphop", "classic", "pop", "classic", "classic", "pop", "hiphop"}, new int[]{2000, 500, 600, 150, 800, 2500, 2000}))));
    }

    public static int[] getMelonBestAlbum(String[] genres, int[] plays) {
        // 1. 장르별 총 재생 수 저장
        Map<String, Integer> genreTotalMap = new HashMap<>();

        // 2. 장르별 노래 리스트 저장 (index랑 play 정보 같이 담기)
        Map<String, List<int[]>> genreSongMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            genreTotalMap.put(genre, genreTotalMap.getOrDefault(genre, 0) + play);

            genreSongMap.putIfAbsent(genre, new ArrayList<>());
            genreSongMap.get(genre).add(new int[]{i, play});
        }

        // 3. 장르를 재생 수 기준으로 정렬
        List<String> sortedGenres = new ArrayList<>(genreTotalMap.keySet());
        sortedGenres.sort((a, b) -> genreTotalMap.get(b) - genreTotalMap.get(a));

        // 4. 각 장르에서 2곡씩 고르기
        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> songs = genreSongMap.get(genre);

            // 곡을 재생수 내림차순, 같으면 인덱스 오름차순으로 정렬
            songs.sort((a, b) -> {
                if (b[1] == a[1]) return a[0] - b[0];
                return b[1] - a[1];
            });

            // 최대 2곡까지 선택
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i)[0]);
            }
        }

        // 결과를 int[]로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
