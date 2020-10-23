
# install google gtest
##1 download google gtest from github release
    https://github.com/google/googletest/releases/tag/release-1.10.0

##2 Build Gtest
    
JetBrain Clion IDE open the prev Directory than Build it
menu 'Build' -> 'Build Project'

##3 Copy .a
the compile .a static fil is in ../cmake-build-debug/lib

cp libgtestd.a libgmockd.a ./lib

## TestUnit
https://www.dyxmq.cn/program/usage-of-googletest.html
