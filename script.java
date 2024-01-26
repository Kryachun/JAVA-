(function() {
    var sliderscontainer = Document.QuerySelector ('.sliders-container');
    var msNumbers = new MomentumSlider ({
        El: Sliderscontainer, 
        CssClass: 'ms--numbers',
        Range: [1, 4],
        RangeContent: function(i) {
            return '0' + i;
        },
        Style: {
            Transform: [{scale: [0.4, 1]}],
            Opacity: [0, 1]
        },
        Interactive: false
    });
    var Titles = [
        'king of the ring fight',
        'sound of streets',
        'urban fashion',
        'windy sunset'
    ];
    var MsTitles = new MomentumSlider ({
        El: Sliderscontainer, 
        CssClass: 'ms--titles',
        Range: [0, 3],
        var MsLinks = new MomentumSlider ({
            El: Sliderscontainer, 
            CssClass: 'ms--Links',
            Range: [0, 3],
            RangeContent: function (){
                return '<a class = "ms-slide__link"> view case </a>';
            },
            Vertical: true,
            Interactive: false
        });
        var Pagination = Document.QuerySelector ('.pagination');
        var PaginationItems = [].Slice.Call(Pagination.Children);
        var MsImages = new MomentumSlider ({
            El: Sliderscontainer,
            CssClass: 'ms--images',
            Range: [0, 3],
            RangeContent: function (){
                return '<div class = "ms-slide__image-container"><div class = "ms-slide__image"></div></div>'
                },
                Sync: [MsNumbers, MsTitles, MsLinks]
        })
    })
}
