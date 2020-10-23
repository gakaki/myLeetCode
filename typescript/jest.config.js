module.exports = {
  preset: 'ts-jest',
  testEnvironment: 'node',
  transform: {
      "^.+\\.(ts|tsx)$": "ts-jest"
  },
  testRegex: '(.*|(\\.|/)(test|spec))\\.(jsx?|tsx?)$',
  moduleFileExtensions: ['ts', 'tsx', 'js', 'jsx', 'json', 'node'],
};


