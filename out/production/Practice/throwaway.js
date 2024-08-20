function wordCounts(inputString) {
  newArray = inputString.split(" ");
  // console.log(newArray);
  newDict = {}
  for (i of newArray) {
    if (newDict[i] === undefined) {
      newDict[i] = 1
    } else {
      newDict[i] += 1
    }
  }
  return newDict;
}

console.log(wordCounts("this is my string of words string of words"))
