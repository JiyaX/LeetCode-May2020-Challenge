class Solution:
    def firstUniqChar(self, s: str) -> int:
        "def first_uniq_char(s):"
        counts = Counter(s)
        return next((i for i, c in enumerate(s) if counts[c] == 1), -1)
