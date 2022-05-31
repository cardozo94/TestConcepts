package oop.patternsdesign.structural.facade.complex;

public class CodecFactory {

	public static Codec extract(VideoFile file) {
		String type = file.getCodecType();
		Codec codec;
		if (type.equals("mp4")) {
			System.out.println("CodecFactory: extracting mpeg audio...");
			codec = new MPEG4CompressionCodec();
		} else {
			System.out.println("CodecFactory: extracting ogg audio...");
			codec = new OggCompressionCodec();
		}
		return codec;
	}

}
