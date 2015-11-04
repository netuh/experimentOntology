/**
 */
package experimentOntology.planning.threats.util;

import experimentOntology.planning.threats.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.threats.ThreatsPackage
 * @generated
 */
public class ThreatsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ThreatsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ThreatsPackage.eINSTANCE;
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
	protected ThreatsSwitch<Adapter> modelSwitch =
		new ThreatsSwitch<Adapter>() {
			@Override
			public Adapter caseThreats(Threats object) {
				return createThreatsAdapter();
			}
			@Override
			public Adapter caseThreat(Threat object) {
				return createThreatAdapter();
			}
			@Override
			public Adapter caseInternalThreat(InternalThreat object) {
				return createInternalThreatAdapter();
			}
			@Override
			public Adapter caseConclusionThreat(ConclusionThreat object) {
				return createConclusionThreatAdapter();
			}
			@Override
			public Adapter caseConstructTreat(ConstructTreat object) {
				return createConstructTreatAdapter();
			}
			@Override
			public Adapter caseExternalThreat(ExternalThreat object) {
				return createExternalThreatAdapter();
			}
			@Override
			public Adapter caseDiffusionOfImitation(DiffusionOfImitation object) {
				return createDiffusionOfImitationAdapter();
			}
			@Override
			public Adapter caseMortality(Mortality object) {
				return createMortalityAdapter();
			}
			@Override
			public Adapter caseHistory(History object) {
				return createHistoryAdapter();
			}
			@Override
			public Adapter caseAmbiguity(Ambiguity object) {
				return createAmbiguityAdapter();
			}
			@Override
			public Adapter caseInteractionWithSelection(InteractionWithSelection object) {
				return createInteractionWithSelectionAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseInstrumentation(Instrumentation object) {
				return createInstrumentationAdapter();
			}
			@Override
			public Adapter caseMaturation(Maturation object) {
				return createMaturationAdapter();
			}
			@Override
			public Adapter caseResentfulDemoralization(ResentfulDemoralization object) {
				return createResentfulDemoralizationAdapter();
			}
			@Override
			public Adapter caseStatisticalRegretion(StatisticalRegretion object) {
				return createStatisticalRegretionAdapter();
			}
			@Override
			public Adapter caseCompensatoryRivality(CompensatoryRivality object) {
				return createCompensatoryRivalityAdapter();
			}
			@Override
			public Adapter caseInteractionWithSetting(InteractionWithSetting object) {
				return createInteractionWithSettingAdapter();
			}
			@Override
			public Adapter caseInteractionOfHistory(InteractionOfHistory object) {
				return createInteractionOfHistoryAdapter();
			}
			@Override
			public Adapter caseInteractionOfSelection(InteractionOfSelection object) {
				return createInteractionOfSelectionAdapter();
			}
			@Override
			public Adapter caseRelialibilityOfMeasures(RelialibilityOfMeasures object) {
				return createRelialibilityOfMeasuresAdapter();
			}
			@Override
			public Adapter caseLowStatisticalPower(LowStatisticalPower object) {
				return createLowStatisticalPowerAdapter();
			}
			@Override
			public Adapter caseRelizabilityOfTreatment(RelizabilityOfTreatment object) {
				return createRelizabilityOfTreatmentAdapter();
			}
			@Override
			public Adapter caseRandomIrrelevance(RandomIrrelevance object) {
				return createRandomIrrelevanceAdapter();
			}
			@Override
			public Adapter caseFishingAndErrorRate(FishingAndErrorRate object) {
				return createFishingAndErrorRateAdapter();
			}
			@Override
			public Adapter caseViolatedAssumption(ViolatedAssumption object) {
				return createViolatedAssumptionAdapter();
			}
			@Override
			public Adapter caseRandomHeteriogenity(RandomHeteriogenity object) {
				return createRandomHeteriogenityAdapter();
			}
			@Override
			public Adapter caseInadequadePreoperation(InadequadePreoperation object) {
				return createInadequadePreoperationAdapter();
			}
			@Override
			public Adapter caseExperimenterExpectation(ExperimenterExpectation object) {
				return createExperimenterExpectationAdapter();
			}
			@Override
			public Adapter caseRestrictedGeneralization(RestrictedGeneralization object) {
				return createRestrictedGeneralizationAdapter();
			}
			@Override
			public Adapter caseInteractionOfTesting(InteractionOfTesting object) {
				return createInteractionOfTestingAdapter();
			}
			@Override
			public Adapter caseHipothesisGuessing(HipothesisGuessing object) {
				return createHipothesisGuessingAdapter();
			}
			@Override
			public Adapter caseEvaluationAppreension(EvaluationAppreension object) {
				return createEvaluationAppreensionAdapter();
			}
			@Override
			public Adapter caseMonoMethodBias(MonoMethodBias object) {
				return createMonoMethodBiasAdapter();
			}
			@Override
			public Adapter caseConfoundingConstruct(ConfoundingConstruct object) {
				return createConfoundingConstructAdapter();
			}
			@Override
			public Adapter caseMonoOperationBias(MonoOperationBias object) {
				return createMonoOperationBiasAdapter();
			}
			@Override
			public Adapter caseInteractionOfDifferents(InteractionOfDifferents object) {
				return createInteractionOfDifferentsAdapter();
			}
			@Override
			public Adapter caseMitigationAction(MitigationAction object) {
				return createMitigationActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.Threats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.Threats
	 * @generated
	 */
	public Adapter createThreatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.Threat
	 * @generated
	 */
	public Adapter createThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.InternalThreat <em>Internal Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.InternalThreat
	 * @generated
	 */
	public Adapter createInternalThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.ConclusionThreat <em>Conclusion Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.ConclusionThreat
	 * @generated
	 */
	public Adapter createConclusionThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.ConstructTreat <em>Construct Treat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.ConstructTreat
	 * @generated
	 */
	public Adapter createConstructTreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.ExternalThreat <em>External Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.ExternalThreat
	 * @generated
	 */
	public Adapter createExternalThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.DiffusionOfImitation <em>Diffusion Of Imitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.DiffusionOfImitation
	 * @generated
	 */
	public Adapter createDiffusionOfImitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.Mortality <em>Mortality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.Mortality
	 * @generated
	 */
	public Adapter createMortalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.History
	 * @generated
	 */
	public Adapter createHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.Ambiguity <em>Ambiguity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.Ambiguity
	 * @generated
	 */
	public Adapter createAmbiguityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.InteractionWithSelection <em>Interaction With Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.InteractionWithSelection
	 * @generated
	 */
	public Adapter createInteractionWithSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.Instrumentation <em>Instrumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.Instrumentation
	 * @generated
	 */
	public Adapter createInstrumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.Maturation <em>Maturation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.Maturation
	 * @generated
	 */
	public Adapter createMaturationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.ResentfulDemoralization <em>Resentful Demoralization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.ResentfulDemoralization
	 * @generated
	 */
	public Adapter createResentfulDemoralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.StatisticalRegretion <em>Statistical Regretion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.StatisticalRegretion
	 * @generated
	 */
	public Adapter createStatisticalRegretionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.CompensatoryRivality <em>Compensatory Rivality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.CompensatoryRivality
	 * @generated
	 */
	public Adapter createCompensatoryRivalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.InteractionWithSetting <em>Interaction With Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.InteractionWithSetting
	 * @generated
	 */
	public Adapter createInteractionWithSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.InteractionOfHistory <em>Interaction Of History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.InteractionOfHistory
	 * @generated
	 */
	public Adapter createInteractionOfHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.InteractionOfSelection <em>Interaction Of Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.InteractionOfSelection
	 * @generated
	 */
	public Adapter createInteractionOfSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.RelialibilityOfMeasures <em>Relialibility Of Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.RelialibilityOfMeasures
	 * @generated
	 */
	public Adapter createRelialibilityOfMeasuresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.LowStatisticalPower <em>Low Statistical Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.LowStatisticalPower
	 * @generated
	 */
	public Adapter createLowStatisticalPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.RelizabilityOfTreatment <em>Relizability Of Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.RelizabilityOfTreatment
	 * @generated
	 */
	public Adapter createRelizabilityOfTreatmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.RandomIrrelevance <em>Random Irrelevance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.RandomIrrelevance
	 * @generated
	 */
	public Adapter createRandomIrrelevanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.FishingAndErrorRate <em>Fishing And Error Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.FishingAndErrorRate
	 * @generated
	 */
	public Adapter createFishingAndErrorRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.ViolatedAssumption <em>Violated Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.ViolatedAssumption
	 * @generated
	 */
	public Adapter createViolatedAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.RandomHeteriogenity <em>Random Heteriogenity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.RandomHeteriogenity
	 * @generated
	 */
	public Adapter createRandomHeteriogenityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.InadequadePreoperation <em>Inadequade Preoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.InadequadePreoperation
	 * @generated
	 */
	public Adapter createInadequadePreoperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.ExperimenterExpectation <em>Experimenter Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.ExperimenterExpectation
	 * @generated
	 */
	public Adapter createExperimenterExpectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.RestrictedGeneralization <em>Restricted Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.RestrictedGeneralization
	 * @generated
	 */
	public Adapter createRestrictedGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.InteractionOfTesting <em>Interaction Of Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.InteractionOfTesting
	 * @generated
	 */
	public Adapter createInteractionOfTestingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.HipothesisGuessing <em>Hipothesis Guessing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.HipothesisGuessing
	 * @generated
	 */
	public Adapter createHipothesisGuessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.EvaluationAppreension <em>Evaluation Appreension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.EvaluationAppreension
	 * @generated
	 */
	public Adapter createEvaluationAppreensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.MonoMethodBias <em>Mono Method Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.MonoMethodBias
	 * @generated
	 */
	public Adapter createMonoMethodBiasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.ConfoundingConstruct <em>Confounding Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.ConfoundingConstruct
	 * @generated
	 */
	public Adapter createConfoundingConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.MonoOperationBias <em>Mono Operation Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.MonoOperationBias
	 * @generated
	 */
	public Adapter createMonoOperationBiasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.InteractionOfDifferents <em>Interaction Of Differents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.InteractionOfDifferents
	 * @generated
	 */
	public Adapter createInteractionOfDifferentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.MitigationAction <em>Mitigation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.MitigationAction
	 * @generated
	 */
	public Adapter createMitigationActionAdapter() {
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

} //ThreatsAdapterFactory
