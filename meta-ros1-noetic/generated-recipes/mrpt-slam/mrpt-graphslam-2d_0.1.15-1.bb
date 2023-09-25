# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Implement graphSLAM using the mrpt-graphslam library, in an online fashion   	by directly reading measurements off ROS Topics."
AUTHOR = "Nikos Koukis <nickkouk@gmail.com>"
ROS_AUTHOR = "Nikos Koukis <nickkouk@gmail.com>"
HOMEPAGE = "http://www.mrpt.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_slam"
ROS_BPN = "mrpt_graphslam_2d"

ROS_BUILD_DEPENDS = " \
    fkie-multimaster-msgs \
    geometry-msgs \
    mrpt-msgs \
    mrpt-msgs-bridge \
    mrpt2 \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    fkie-multimaster-msgs \
    geometry-msgs \
    mrpt-msgs \
    mrpt-msgs-bridge \
    mrpt2 \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fkie-multimaster-msgs \
    geometry-msgs \
    mrpt-msgs \
    mrpt-msgs-bridge \
    mrpt2 \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/noetic/mrpt_graphslam_2d/0.1.15-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mrpt_graphslam_2d"
SRC_URI = "git://github.com/mrpt-ros-pkg-release/mrpt_slam-release;${ROS_BRANCH};protocol=https"
SRCREV = "d9712a0209ff3dcf933f955deaf3e83122edf40c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
