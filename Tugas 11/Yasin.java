public class Yasin extends siswa{

    @Override
	protected void Data(){
		System.out.println("Nama : Muhamad Yasin Permana");
		System.out.println("Nim	 : 10113412");
	}
			
    @Override
	protected void Kuliah(){
		System.out.println("Minimal Nilai dapat C");
	}
			
    @Override
	protected void Lulus(){
		System.out.println("Harus Lulus");
	}
			
    @Override
	protected void tdkLulus(){
		System.out.println("Harus LULUS");
	}
}