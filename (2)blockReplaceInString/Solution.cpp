class Solution {
public:
	void replaceSpace(char *str,int length) {
		if(str == NULL || length < 0) 
			return;

		int oldLength = 0;
		int newLength = 0;
		int spaceCount = 0;

		for (int i = 0; str[i]!='\0'; i++) {
			if(str[i] == ' ') {
				spaceCount ++;
			}
			oldLength++;
		}

		if(spaceCount == 0)
			return;

		newLength = oldLength + spaceCount * 2;

		if(newLength > length)
			return;

		while(oldLength >= 0 && newLength > oldLength) {
			if(str[oldLength] == ' ') {
				str[newLength--] = '0';
				str[newLength--] = '2';
				str[newLength--] = '%';
			} else {
				str[newLength--] = str[oldLength];
			}
			oldLength--;
		}
		

	}
};