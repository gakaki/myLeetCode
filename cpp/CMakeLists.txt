cmake_minimum_required(VERSION 3.15)
project(cpp)
set(CMAKE_CXX_STANDARD 20)

# 添加上库文件的路径，注意相对路径
link_directories(lib/)
# 添加可执行文件
add_executable(cpp 0098_Validate_Binary_Search_Tree.cpp)
# 链接gtest库文件
target_link_libraries(cpp libgtestd.a)

include_directories(
    include
)

# https://blog.cugxuan.cn/2019/11/01/Software/multi-main-func-run-in-clion/
file (GLOB files *.cpp)
foreach (file ${files})
    string(REGEX REPLACE ".+/(.+)\\..*" "\\1" exe ${file})
    message (--\ ${exe}-----  -${file})
    add_executable (${exe} ${file})

    target_link_libraries(${exe} libgtestd.a)
    #    # 链接gtest库文件
    message (\ \ \ \ --\ src/${exe}.cpp\ will\ be\ compiled\ to\ bin/${exe})
endforeach ()


#target_link_libraries(cpp libgtestd.a)





