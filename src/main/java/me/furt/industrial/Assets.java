package me.furt.industrial;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;

import org.getspout.spoutapi.SpoutManager;

public class Assets {
	private IndustrialInc plugin;
	private HashMap<String, BufferedImage> imageCache = new HashMap<String, BufferedImage>();

	public Assets(IndustrialInc instance) {
		this.plugin = instance;
	}

	public BufferedImage getCachedImage(String cacheFileName) {
		if (imageCache.containsKey(cacheFileName)) {
			return (BufferedImage) imageCache.get(cacheFileName);
		}
		return null;
	}

	public void freeImageCacheMemory() {
		imageCache.clear();
	}

	public void addAsset(String name, String image) {
		URL url = getClass().getResource(image);
		
		File cacheFile = new File(url.getFile());
		try {
			InputStream inputStream = url.openStream();
			OutputStream out = new FileOutputStream(cacheFile);

			byte[] bytes = new byte[1024];
			int read;
			while ((read = inputStream.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}
			out.flush();
			out.close();
			inputStream.close();
		} catch (Exception exception) {
		}
		cacheFile.deleteOnExit();

		if (image.endsWith(".png")) {
			BufferedImage bufferedImage = null;
			try {
				bufferedImage = ImageIO.read(url);
			} catch (Exception exception) {
			}
			imageCache.put(name, bufferedImage);
		}

		SpoutManager.getFileManager().addToPreLoginCache(plugin, cacheFile);
	}
}