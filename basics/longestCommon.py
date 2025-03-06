class Solution(object):
    def longestCommonPrefix(self, strs):
        strs.sort()
        index = 0
        s1 = strs[0]
        s2 = strs[len(strs) - 1]

        while index < len(s1) and index < len(s2):
            if s1[index] == s2[index]:
                index += 1
            else:
                break
        return s1[0:index]
     
        