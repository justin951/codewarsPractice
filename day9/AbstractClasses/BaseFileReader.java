package day9.AbstractClasses;

public abstract class BaseFileReader {

  protected Path filePath;

  protected BaseFileReader(Path filePath) {
    this.filePath = filePath;
  }

  public Path getFilePath() {
    return filePath;
  }

  public List<String> readFile() throws IOException {
    return Files.lines(filePath).map(this::mapFileLine).collect(Collectors.toList());
  }

  protected abstract String mapFileLine(String line);
}
