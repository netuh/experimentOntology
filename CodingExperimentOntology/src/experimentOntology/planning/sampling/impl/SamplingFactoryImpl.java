/**
 */
package experimentOntology.planning.sampling.impl;

import experimentOntology.planning.sampling.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SamplingFactoryImpl extends EFactoryImpl implements SamplingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SamplingFactory init() {
		try {
			SamplingFactory theSamplingFactory = (SamplingFactory)EPackage.Registry.INSTANCE.getEFactory(SamplingPackage.eNS_URI);
			if (theSamplingFactory != null) {
				return theSamplingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SamplingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SamplingPackage.SIMPLE_RANDOM_TECHINIQUE: return createSimpleRandomTechinique();
			case SamplingPackage.SYSTEMATIC_TECHINIQUE: return createSystematicTechinique();
			case SamplingPackage.STRATIFIED_RANDOM_SAMPLING_TECHINIQUE: return createStratifiedRandomSamplingTechinique();
			case SamplingPackage.CONVENIENCE_SAMPLING: return createConvenienceSampling();
			case SamplingPackage.QUOTE_SAMPLING: return createQuoteSampling();
			case SamplingPackage.POPULATION_DESCRIPTION: return createPopulationDescription();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRandomTechinique createSimpleRandomTechinique() {
		SimpleRandomTechiniqueImpl simpleRandomTechinique = new SimpleRandomTechiniqueImpl();
		return simpleRandomTechinique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystematicTechinique createSystematicTechinique() {
		SystematicTechiniqueImpl systematicTechinique = new SystematicTechiniqueImpl();
		return systematicTechinique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StratifiedRandomSamplingTechinique createStratifiedRandomSamplingTechinique() {
		StratifiedRandomSamplingTechiniqueImpl stratifiedRandomSamplingTechinique = new StratifiedRandomSamplingTechiniqueImpl();
		return stratifiedRandomSamplingTechinique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConvenienceSampling createConvenienceSampling() {
		ConvenienceSamplingImpl convenienceSampling = new ConvenienceSamplingImpl();
		return convenienceSampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuoteSampling createQuoteSampling() {
		QuoteSamplingImpl quoteSampling = new QuoteSamplingImpl();
		return quoteSampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationDescription createPopulationDescription() {
		PopulationDescriptionImpl populationDescription = new PopulationDescriptionImpl();
		return populationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingPackage getSamplingPackage() {
		return (SamplingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SamplingPackage getPackage() {
		return SamplingPackage.eINSTANCE;
	}

} //SamplingFactoryImpl
