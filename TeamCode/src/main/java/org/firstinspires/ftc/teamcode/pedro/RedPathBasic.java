package org.firstinspires.ftc.teamcode.pedro;

import static com.pedropathing.api.Paths.*;
import com.pedropathing.api.Paths;

import com.pedropathing.api.PoseFactory;
import com.pedropathing.math.Pose;
import com.pedropathing.paths.Path;
import com.pedropathing.paths.interpolator.Interpolator;

public class RedPathBasic {

    private final PoseFactory poseFactory = PoseFactory.degrees();

    private final Pose start = poseFactory.of(56, 8, 90);
    private final Pose path1 = poseFactory.of(5.3185, 8.2782, 270);
    private final Pose path1Control1 = poseFactory.of(89.9344, 74.8335, 0);
    private final Pose point2 = poseFactory.of(56.3485, 17.8315, -270);
    private final Pose point2Segment1Heading = poseFactory.of(56.3485, 17.8315, 270);
    private final Pose point2Segment2Start = poseFactory.of(56.3485, 17.8315, -90);
    private final Pose point2Segment2End = poseFactory.of(56.3485, 17.8315, 90);
    private final Pose point3Start = poseFactory.of(56.3485, 17.8315, 0);
    private final Pose point3 = poseFactory.of(10.7253, 40.8555, 90);
    private final Pose point3Control1 = poseFactory.of(17.7206, 23.4687, 0);
    private final Pose point4Start = poseFactory.of(10.7253, 40.8555, 0);
    private final Pose point4 = poseFactory.of(57.9276, 119.7573, -90);
    private final Pose point4Control1 = poseFactory.of(23.3066, 89.4737, 0);

    public Path path1() {
        return Paths.curve(start, path1Control1, path1).linear(start, path1);
    }

    public Path path2() {
        return Paths.line(path1, point2).heading(Interpolator.piecewise().until(0.5, Interpolator.constant(point2Segment1Heading)).until(1, Interpolator.linear(point2Segment2Start, point2Segment2End)));
    }

    public Path path3() {
        return Paths.curve(point3Start, point3Control1, point3).linear(point3Start, point3);
    }

    public Path path4() {
        return Paths.curve(point4Start, point4Control1, point4).linear(point4Start, point4);
    }
}
