class Solution:
    def minSteps(self, s: str, t: str) -> int:
        s_count = {}
        t_count = {}
        for char in s:
            s_count[char] = s_count.get(char, 0) + 1
        for char in t:
            t_count[char] = t_count.get(char, 0) + 1

        steps = 0
        for char in s_count:
            steps += max(0, s_count[char] - t_count.get(char, 0))

        return steps