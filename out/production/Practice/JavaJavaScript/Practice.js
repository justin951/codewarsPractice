// // 001 - join array
// function smash (words) {
//   return words.join(" ")
// };

// console.log(smash(["this", "is", "a", "test"]))


function dutyFree(normPrice, discount, hol) {
  const discountPercent = discount / 100;
  const discountPrice = normPrice * (1 - discountPercent)
  console.log("holiday cost is " + hol)
  console.log("normPrice is " + normPrice)
  console.log("discountPrice is " + discountPrice)
  console.log("discountPercent is " + discountPercent)
  return Math.floor(hol / (normPrice - discountPrice))
}

console.log(dutyFree(10, 20, 10))
