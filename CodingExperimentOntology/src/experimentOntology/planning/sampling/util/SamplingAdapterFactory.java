/**
 */
package experimentOntology.planning.sampling.util;

import experimentOntology.planning.sampling.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.sampling.SamplingPackage
 * @generated
 */
public class SamplingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SamplingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SamplingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplingSwitch<Adapter> modelSwitch =
		new SamplingSwitch<Adapter>() {
			@Override
			public Adapter caseSamplingStrategy(SamplingStrategy object) {
				return createSamplingStrategyAdapter();
			}
			@Override
			public Adapter caseProbabilityTechinique(ProbabilityTechinique object) {
				return createProbabilityTechiniqueAdapter();
			}
			@Override
			public Adapter caseSimpleRandomTechinique(SimpleRandomTechinique object) {
				return createSimpleRandomTechiniqueAdapter();
			}
			@Override
			public Adapter caseSystematicTechinique(SystematicTechinique object) {
				return createSystematicTechiniqueAdapter();
			}
			@Override
			public Adapter caseStratifiedRandomSamplingTechinique(StratifiedRandomSamplingTechinique object) {
				return createStratifiedRandomSamplingTechiniqueAdapter();
			}
			@Override
			public Adapter caseNoProbabilityTechinique(NoProbabilityTechinique object) {
				return createNoProbabilityTechiniqueAdapter();
			}
			@Override
			public Adapter caseConvenienceSampling(ConvenienceSampling object) {
				return createConvenienceSamplingAdapter();
			}
			@Override
			public Adapter caseQuoteSampling(QuoteSampling object) {
				return createQuoteSamplingAdapter();
			}
			@Override
			public Adapter casePopulationDescription(PopulationDescription object) {
				return createPopulationDescriptionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.SamplingStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.SamplingStrategy
	 * @generated
	 */
	public Adapter createSamplingStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.ProbabilityTechinique <em>Probability Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.ProbabilityTechinique
	 * @generated
	 */
	public Adapter createProbabilityTechiniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.SimpleRandomTechinique <em>Simple Random Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.SimpleRandomTechinique
	 * @generated
	 */
	public Adapter createSimpleRandomTechiniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.SystematicTechinique <em>Systematic Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.SystematicTechinique
	 * @generated
	 */
	public Adapter createSystematicTechiniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.StratifiedRandomSamplingTechinique <em>Stratified Random Sampling Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.StratifiedRandomSamplingTechinique
	 * @generated
	 */
	public Adapter createStratifiedRandomSamplingTechiniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.NoProbabilityTechinique <em>No Probability Techinique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.NoProbabilityTechinique
	 * @generated
	 */
	public Adapter createNoProbabilityTechiniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.ConvenienceSampling <em>Convenience Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.ConvenienceSampling
	 * @generated
	 */
	public Adapter createConvenienceSamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.QuoteSampling <em>Quote Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.QuoteSampling
	 * @generated
	 */
	public Adapter createQuoteSamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.sampling.PopulationDescription <em>Population Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.sampling.PopulationDescription
	 * @generated
	 */
	public Adapter createPopulationDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SamplingAdapterFactory
