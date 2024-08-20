// function arrayDiff(a, b) {
//   let newlist = [];
//   for (let each of a) {
//     if (!b.includes(each)) {
//       newlist.push(each)
//     }
//   }
//   return newlist;
// }

// const arr1 = [1, 2, 3, 4, 5]
// const arr2 = [2, 3]
// console.log(arrayDiff(arr1, arr2))

function dnaStrand(dna){
  const dnaDict = {
    "A": "T",
    "T": "A",
    "C": "G",
    "G": "C"
  }
  return dna.split("").map(char => dnaDict[char]).join("");
}

console.log(dnaStrand("ATTGC"))
