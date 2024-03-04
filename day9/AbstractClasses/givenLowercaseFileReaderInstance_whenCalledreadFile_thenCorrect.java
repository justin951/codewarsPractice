package day9.AbstractClasses;

// @Test
public void givenLowercaseFileReaderInstance_whenCalledreadFile_thenCorrect()throws Exception{URL location=getClass().getClassLoader().getResource("files/test.txt")Path path=Paths.get(location.toURI());BaseFileReader lowercaseFileReader=new LowercaseFileReader(path);assertThat(lowercaseFileReader.readFile()).isInstanceOf(List.class);}
