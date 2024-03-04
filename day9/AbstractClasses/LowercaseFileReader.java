package day9.AbstractClasses;

public class LowercaseFileReader extends BaseFileReader {
  super(filePath);
}

@Override
public String mapFileLine(String line) {
  return line.toLowerCase();
}
