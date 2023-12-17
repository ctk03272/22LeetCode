class PointDisjointSet {
    constructor(points) {
        this.parent = {};

        for (let [x, y] of points) {
            const id = this.getId(x, y);
            this.parent[id] = id;
        }
    }

    getId(x, y) {
        return `${x},${y}`;
    }

    find(x, y) {
        let id = this.getId(x, y);
        if (this.parent[id] !== id) {
            this.parent[id] = this.find(...this.parent[id].split(',').map(Number));
        }
        return this.parent[id];
    }

    union([x1, y1], [x2, y2]) {
        const id1 = this.find(x1, y1);
        const id2 = this.find(x2, y2);

        if (id1 !== id2) {
            this.parent[id2] = id1;
        }
    }

    connected([x1, y1], [x2, y2]) {
        return this.find(x1, y1) === this.find(x2, y2);
    }
}

class Edge {
    constructor(startNode, endNode, distance) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.distance = distance;
    }
}

class Graph {
    constructor(points) {
        this.edges = []
        for (let i = 0; i < points.length; i++) {
            for (let j = i + 1; j < points.length; j++) {
                const distance = this.calculateDistance(points[i], points[j])
                this.edges.push(new Edge(points[i], points[j], distance))
            }
        }
    }

    calculateDistance([x1, y1], [x2, y2]) {
        return Math.abs((x2 - x1)) + Math.abs((y2 - y1))
    }
}

class MinimumSpanningTree {
    constructor(points) {
        this.graph = new Graph(points)
        this.pds = new PointDisjointSet(points)
    }

    kruskalMST() {
        this.graph.edges.sort((a, b) => a.distance - b.distance)
        let mst = []
        let totalDistance = 0
        for (let edge of this.graph.edges) {
            if (!this.pds.connected(edge.startNode, edge.endNode)) {
                this.pds.union(edge.startNode, edge.endNode)
                totalDistance += edge.distance
                mst.push(edge)
            }
        }
        return {
            mst: mst,
            totalDistance: totalDistance
        }
    }
}

var minCostConnectPoints = function (points) {
    let result=new MinimumSpanningTree(points)
    return result.kruskalMST().totalDistance
}

minCostConnectPoints([[0, 0], [2, 2], [3, 10], [5, 2], [7, 0]])
