package oop.patternsdesign.structural.facade;

import java.io.File;

import oop.patternsdesign.structural.facade.complex.AudioMixer;
import oop.patternsdesign.structural.facade.complex.BitRateReader;
import oop.patternsdesign.structural.facade.complex.Codec;
import oop.patternsdesign.structural.facade.complex.CodecFactory;
import oop.patternsdesign.structural.facade.complex.MPEG4CompressionCodec;
import oop.patternsdesign.structural.facade.complex.OggCompressionCodec;
import oop.patternsdesign.structural.facade.complex.VideoFile;

public class VideoConversionFacade {

	public File	convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);
		Codec destinationCodec;
		if(format.equals("mp4"))
			destinationCodec = new OggCompressionCodec();
		else
			destinationCodec = new MPEG4CompressionCodec();
		
		VideoFile buffer = BitRateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitRateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
	
}
