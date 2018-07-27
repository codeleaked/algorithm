One-edit distance
-----------------

There are three types of edits that can be performed on string:
- Insert a character
- Remove a character
- Replace a character

Given two strings, write a function to check if they are one edit (or zero edits) away.

**Example**
```$xslt
pale, ple   -> true
pales, pale -> true
pale, bale  -> true
pale, bake  -> false
```