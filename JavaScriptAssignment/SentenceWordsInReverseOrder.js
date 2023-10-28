function reverseWords(sentence) {
    // function to reverse a word
    function reverseWord(word) {
      let reversedWord = '';
      for (let i = word.length - 1; i >= 0; i--) {
        reversedWord += word[i];
      }
      return reversedWord;
    }
  
    let reversedSentence = '';
    let word = '';
    for (let i = 0; i < sentence.length; i++) {
      if (sentence[i] === ' ' || i === sentence.length - 1) {
        if (i === sentence.length - 1) {
          word += sentence[i];
        }
        reversedSentence += reverseWord(word) + (i === sentence.length - 1 ? '' : ' ');
        word = '';
      } else {
        word += sentence[i];
      }
    }
  
    return reversedSentence;
  }
  
  const inputSentence = "This is a sunny day";
  const reversedSentence = reverseWords(inputSentence);
  console.log(reversedSentence);