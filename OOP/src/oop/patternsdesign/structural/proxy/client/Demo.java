package oop.patternsdesign.structural.proxy.client;

import oop.patternsdesign.structural.proxy.service.ThirdPartyYoutubeClass;
import oop.patternsdesign.structural.proxy.service.YouTubeCacheProxy;

public class Demo {

	public static void main(String[] args) {
		YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYoutubeClass());
		YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());
		
		long naive = test(naiveDownloader);
		long smart = test(smartDownloader);
		System.out.println("Time saved by caching proxy: "+(naive -smart)+"ms");

	}
	
	private static long test(YouTubeDownloader downloader) {
		long startTime = System.currentTimeMillis();
		
		downloader.renderPopularVideos();
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderPopularVideos();
		downloader.renderVideoPage("dancesvideoo");
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderVideoPage("someothervid");
		
		long estimatedTime = System.currentTimeMillis() -startTime;
		System.out.println("time elapsed: "+estimatedTime+"ms");
		return estimatedTime;
	}

}
